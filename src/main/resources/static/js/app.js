var stompClient = null;
alert ("shima")
//3秒後にconnect処理
setTimeout("connect()", 3000);

$(function () {
	
  $("form").on('submit', function (e) {
	// submitイベントの本来の動作を止める
    e.preventDefault();
  });
//connectが押下された時の処理
  $("#connect").click(function () {
    connect();
  });
//disconnectが押下された時の処理
  $("#disconnect").click(function () {
    disconnect();
  });
//sendが押下された時の処理
  $("#send").click(function () {
    sendMessage();
  });
});
function setConnected(connected) {
  $("#connect").prop("disabled", connected);
  $("#disconnect").prop("disabled", !connected);
  if (connected) {
    $("#conversation").show();
  } else {
    $("#conversation").hide();
  }
  $("#message").html("");
}
//connectが押下された時の処理
function connect() {
  var socket = new SockJS('/websocket'); // WebSocket通信開始
  stompClient = Stomp.over(socket);
  stompClient.connect({}, function (frame) {
    setConnected(true);
    console.log('Connected: ' + frame);
    // /receive/messageエンドポイントでメッセージを受信し、表示する
    stompClient.subscribe('/receive/message', function (response) {
      showMessage(JSON.parse(response.body));
    });
  });
}
//disconnectが押下された時の処理
function disconnect() {
  if (stompClient !== null) {
    stompClient.disconnect();
  }
  setConnected(false);
  console.log("Disconnected");
}
//sendが押下された時の処理
function sendMessage() {
  // /send/messageエンドポイントにメッセージを送信する
  stompClient.send("/send/message", {}, JSON.stringify(
      {'name': $("#name").val(), 'statement': $("#statement").val()}));
  $("#statement").val('');
}

function showMessage(message) {
  // 受信したメッセージを整形して表示
  $("#message").append(
      "<tr><td>" + message.name + ": " + message.statement + "</td></tr>");
}


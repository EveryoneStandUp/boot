$("#button1").click(function() {
	$.ajax("/sub35/link1", { method: "post" });
});

$("#button2").click(function() {
	$.ajax("/sub35/link2", { method: "post" });
});

$("#button3").click(function() {
	$.ajax("/sub35/link3", {
		method: "post",
		data: "name=손"
	});
});

$("#button4").click(function() {
	$.ajax("/sub35/link4", {
		method: "post",
		data: "address=seoul&price=99.77"
	});
});

$("#button5").click(function() {
	$.ajax("/sub35/link5", {
		method: "post",
		data: "name=발&score=7.5&email=val@google.com"
	});
});

$("#button6").click(function() {
	$.ajax("/sub35/link6", {
		method: "post",
		data: "address=서울&product=게임기&price=32.32"
	});
});

$("#button7").click(function() {
	const obj = { name: "son" };

	$.ajax("/sub35/link7", {
		method: "post",
		//		data: '{"name": "son"}',
		data: JSON.stringify(obj),
		contentType: "application/json"
	});
});

$("#button8").click(function() {
	const data = {
		address: "Busan",
		name: "박지성"
	};

	$.ajax("/sub35/link8", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
		//		data: '{"address": "Busan", "name": "박지성"}'
	});
});

$("#button9").click(function() {
	const obj = {
		age: 33,
		name: "김덕배",
		married: false
	};

	$.ajax("/sub35/link9", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
		//		data: '{"age": 33, "name": "김덕배", "married": false}',
	});
});

$("#button10").click(function() {
	const obj = {
		address: null,
		age: 30,
		name: "손흥민"
	};


	$.ajax("/sub35/link10", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
		//		data: '{"address": null, "age": 30, "name": "손흥민"}',
	});
});

$("#button11").click(function() {
	const obj = {
		book: {
			title: "java",
			price: 300
		},
		address: "seoul"
	};

	$.ajax("/sub35/link11", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
		//		data: '{"book": {"title": "java", "price": 300}, "address": "seoul"}'
	});
});

$("#button12").click(function() {
	const obj = {
		food: [
			"pizza",
			"coke",
			"coffee"
			],
		store: "피자스쿨"
	};

	$.ajax("/sub35/link12", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
		//		data: '{"food":["pizza", "coke", "coffee"], "store": "피자스쿨"}'
	});
});

$("#button13").click(function() {
	const obj = ["pizza", "coke", "coffee"];

	$.ajax("/sub35/link13", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
		//		data: '["pizza", "coke", "coffee"]'
	});
});

$("#button14").click(function() {
	const data = [
		{
			name: "강백호",
			position: "파포",
		},
		{
			name: "서태웅",
			position: "스포"
		},
		{
			name: "송태섭",
			position: "포인트가드"
		}
	];

	$.ajax("/sub35/link14", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
//		data: '[{"name": "강백호", "position": "파포"}, {"name": "서태웅", "position": "스포"}]'
	});
});



















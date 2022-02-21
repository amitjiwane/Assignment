function myFunction(){
	var name="Amit Jiwane";
	function nestFunction(){
		alert("My Name is "+name);
		console.log("This is Amit Jiwane")
	}
	
	nestFunction();
	
}
myFunction();

//===============================================

function Addition(a){
	return function add2(b){
		return a+b;
	}
}

var first=Addition(10);
var second=Addition(20);

console.log("10 + 2 = "+first(2));
console.log("20 + 5 = "+second(5));
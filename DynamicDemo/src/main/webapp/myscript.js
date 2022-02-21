alert("This is External");
var x=10;
let y=19;
const z=x+y;
document.write("z");

function addition(a, b){
	return a+b;
}

document.writeln("Addition = "+addition(23,12));

function substraction(a, b){
	return a-b;
}
document.writeln("substraction = "+substraction(23,12));

var name=prompt("What is your name??");
document.writeln("Your name is = "+name);

var c=45;
document.writeln(isNaN(c));
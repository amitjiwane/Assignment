function greet(name:string, ...msg:string[]){
	return "Hi, "+name+msg.join(",");
}

console.log(greet("amit"));
console.log(greet("Jiwane","Good Morning"));
console.log(greet("Jiwane","Good Morning","Good afternoon","Good Evening"));
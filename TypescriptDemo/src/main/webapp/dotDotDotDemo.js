function greet(name) {
    var msg = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        msg[_i - 1] = arguments[_i];
    }
    return "Hi, " + name + msg.join(",");
}
console.log(greet("amit"));
console.log(greet("Jiwane", "Good Morning"));
console.log(greet("Jiwane", "Good Morning", "Good afternoon", "Good Evening"));

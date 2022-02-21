var code;
code = 123;
code = "name";
code = true;
function displayType(code) {
    if (typeof (code) === "number") {
        console.log("it is number");
    }
    else if (typeof (code) === "string") {
        console.log("it is string");
    }
    else if (typeof (code) === "boolean") {
        console.log("it is boolean");
    }
    else {
        console.log("something else");
    }
}
displayType(123); //it show number
displayType("hello"); //it shows string
displayType(true); //it show boolean

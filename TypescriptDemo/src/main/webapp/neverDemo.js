function neverUseKeyword(name) {
    throw new Error(name);
}
function withoutParameter() {
    while (true) {
        console.log("This is Sample Code");
    }
    console.log("This is Sample Code");
}
neverUseKeyword("Amit");
withoutParameter();


function neverUseKeyword(name: string): never {​​​​​

    throw new Error(name);

}​​​​​

function withoutParameter(): never {​​​​​

    while (true) {​​​​​ console.log("This is Sample Code"); }​​​​​

    console.log("This is Sample Code");

}​​​​​

neverUseKeyword("Amit");

withoutParameter();

//============================
/*let a=10;
a="hello";
let a="hello";*/
var FruitName;
(function (FruitName) {
    FruitName[FruitName["Apple"] = 5] = "Apple";
    FruitName["Orange"] = "color";
    FruitName[FruitName["Banana"] = 789] = "Banana";
    FruitName[FruitName["Watermalon"] = 790] = "Watermalon";
})(FruitName || (FruitName = {}));
function getWatermalon() {
    return FruitName.Watermalon;
}
/*console.log("Apple = "+Apple);
console.log("Orange = "+Orange);*/
console.log(getWatermalon());

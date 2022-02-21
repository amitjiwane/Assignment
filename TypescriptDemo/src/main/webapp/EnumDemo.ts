enum FruitName{
	Apple=5, Orange="color", Banana=789, Watermalon
}

function getWatermalon():FruitName{
	return FruitName.Watermalon;
}

/*console.log("Apple = "+Apple);
console.log("Orange = "+Orange);*/
console.log(getWatermalon());
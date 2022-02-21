enum PrintMedia{
	Newspaper=1,
	Newsletter=getPrintMediaCode('newsletter'),
	Magazine=Newsletter*3,
	Book=10
}

function getPrintMediaCode(mediaName: string):number{
	if(mediaName==='newsletter'){
		return 5;
	}
}
console.log(PrintMedia.Newsletter);
console.log(PrintMedia.Magazine);
PrintMedia.Newsletter; 
PrintMedia.Magazine;  
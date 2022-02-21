var PrintMedia;
(function (PrintMedia) {
    PrintMedia[PrintMedia["Newspaper"] = 1] = "Newspaper";
    PrintMedia[PrintMedia["Newsletter"] = getPrintMediaCode('newsletter')] = "Newsletter";
    PrintMedia[PrintMedia["Magazine"] = PrintMedia.Newsletter * 3] = "Magazine";
    PrintMedia[PrintMedia["Book"] = 10] = "Book";
})(PrintMedia || (PrintMedia = {}));
function getPrintMediaCode(mediaName) {
    if (mediaName === 'newsletter') {
        return 5;
    }
}
console.log(PrintMedia.Newsletter);
console.log(PrintMedia.Magazine);
PrintMedia.Newsletter;
PrintMedia.Magazine;

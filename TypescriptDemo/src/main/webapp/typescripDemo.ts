let fruits:String[]=["one", "two", "3","four"];
console.log(fruits);

let fruit12:Array<String>=["rock", "domu", "gomu","somu"];
console.log(fruit12);

let fruit1234=["apple","banana",{'name':'amit','city':'nagpur'}];
console.log(fruit1234);

let marks:Array<number>=[1,2,3,4,5];
console.log(marks);

let marks2:Array<number>;
marks2=[11,22,33,44,55];
console.log(marks2);

let stringOrNumber:(string | number)[]=[1,"one",2,"two",3,"three"];
console.log(stringOrNumber);

//tuple
let employee:[number, string]=[1,"Amit"];
console.log(employee);

//tupple arrays
let a:[string][]=[["abc"],["def"],["ghi"]];
a.push(["jkl"]);
console.log(a);

//tuple array
let employee2:[number, string][]=[[1,"amit"],[2,"jiwane"]];
employee2.push([3,"ashok"]);
console.log(employee2);
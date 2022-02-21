var Employee = /** @class */ (function () {
    function Employee(empcode, empname) {
        this.name = empname;
        this.empCode = empcode;
    }
    Employee.prototype.display = function () {
        console.log(this.name + " " + this.empCode);
    };
    return Employee;
}());
var obj1 = new Employee(121, "amit");
var obj2 = new Employee(125, "Jiwane");
obj1.display;
console.log(obj2.empCode);

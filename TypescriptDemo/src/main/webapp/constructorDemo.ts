interface IEmployee{
    empCode:number;
    empName:string;
    getsalray:(number) => number;
    getEmpName(number):string;  // abstract function
}
let obj:IEmployee ={empCode:1,
                    empName:"Amit",
                    getsalray(num):number{
                        return 100;
                    },
                    getEmpName(number):string{
                        return "Amit";
                        }
                    };
console.log(obj.getEmpName(1));
console.log(obj);
console.log(obj.empCode);
console.log(obj.empName);

class Employee implements IEmployee {
    empCode: number;
    empName: string;
    constructor(empCode: number, empName: string) { //parameterized Constructor
        this.empCode = empCode;
 
    }
    getsalray(num): number {
        return 100;
    }
    getEmpName(number): string {
        return "Amit";
    }
}
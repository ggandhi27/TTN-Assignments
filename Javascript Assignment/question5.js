var n = prompt("Enter the number of employees : ");
n = parseInt(n);
while(isNaN(n)){
    n = prompt("Please enter the correct value");
    n = parseInt(n)
}
var lis = [];
while(n!==0){
    var obj = {};
    obj["name"]=prompt("Enter the name of the employee");
    obj["age"]=prompt("Enter the age of the employee");
    obj["age"] = parseInt(obj["age"]);
    while(isNaN(obj["age"])){
        obj["age"] = prompt("Please enter the correct age");
        obj["age"] = parseInt(obj["age"]);
    }
    obj["salary"]=prompt("Enter the salary of the employee");

    while(isNaN(obj["salary"])){
        obj["salary"] = prompt("Please enter the correct salary");
        obj["salary"] = parseInt(obj["salary"]);
    }
    obj["dob"] = prompt("Enter the date of birth of employee");
    lis.push(obj);
    n--;
}

var i;

var rich_employees = [];
var poor_employees = [];
for(i=0;i<lis.length;i++){
    if(lis[i]["salary"]>5000){
        rich_employees.push(lis[i]);
    }
    if(lis[i]["salary"]>1000 && lis[i]["age"]>20){
        lis[i]["salary"] = lis[i]["salary"]*6;
        poor_employees.push(lis[i]);
    }
}
var all;
all  = "<table><thead><th>NAME</th><th>AGE</th><th>SALARY</th><th>DATE OF BIRTH</th></thead>";
lis.forEach(function (x) {
    all = all + "<tr><td>"+x["name"]+"</td>"+"<td>"+x["age"]+"</td>"+"<td>"+x["salary"]+"</td><"+"<td>"+x["dob"]+"</td></tr>";
});
all=all+"</table>";
document.getElementById("all1").innerHTML=all;

var rich;
rich = "";
rich  = "<table><thead><th>NAME</th><th>AGE</th><th>SALARY</th><th>DATE OF BIRTH</th></thead>";
rich_employees.forEach(function (x) {
    rich = rich + "<tr><td>"+x["name"]+"</td>"+"<td>"+x["age"]+"</td>"+"<td>"+x["salary"]+"</td><"+"<td>"+x["dob"]+"</td></tr>";
});
rich=rich+"</table>";
document.getElementById("rich").innerHTML=rich;
 
var poor;
poor_employees.forEach(function (x) {
    console.alert(x);
});

all  = "<table><thead><th>NAME</th><th>AGE</th><th>SALARY</th><th>DATE OF BIRTH</th></thead>";
poor_employees.forEach(function (x) {
    all = all + "<tr><td>"+x["name"]+"</td>"+"<td>"+x["age"]+"</td>"+"<td>"+x["salary"]+"</td><"+"<td>"+x["dob"]+"</td></tr>";
});
all=all+"</table>";
document.getElementById("all").innerHTML=all;

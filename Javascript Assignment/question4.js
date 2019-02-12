var obj = {"name":"gaurav gandhi","age":23,"id":3330};
var obj2={};
for(key in obj){
    obj2[key] = obj[key];
}
console.log(obj2);
alert(obj2.concat());
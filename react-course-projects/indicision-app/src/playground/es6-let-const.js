var nameVar = 'John';
var nameVar = 'Jane';
console.log('nameVar', nameVar);

let nameLet = 'Jen';
nameLet = 'Julie';
console.log('nameLet', nameLet);

const nameConst = 'Frank';
console.log('nameConst', nameConst);

// Block scoping
var fullName = 'Ayuth Mangmesap';
if (fullName) {
  var firstName = fullName.split(' ')[0];
  console.log(firstName);
}

console.log(firstName);

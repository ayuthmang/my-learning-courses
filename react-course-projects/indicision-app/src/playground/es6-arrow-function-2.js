// arguments object - no longer bound with arrow functions
const add = (a, b) => {
  console.log(arguments);
  return a + b;
}
console.log(1, 5, 5000);

// this keyword - no longer bound
const user = {
  name: 'Ayuth',
  cities: ['Bangkok', 'Pathumthani', 'Nonthaburi'],
  printPlaceLived() {
    // const that = this;
    // console.log(this.name);
    // console.log(this.cities);
    // this.cities.forEach((city) => {
    //   console.log(this.name + " has lived in " + city);
    // });
    return this.cities.map((city) => this.name + ' has lived in ' + city);
  }
}
console.log(user.printPlaceLived());

// Challenge area
const multiplier = {
  // numbers - array of numbers
  numbers: [1, 2, 3],
  // multiplyBy - single number
  multiplyBy: 3,
  // multiply - return new array where the number have been multiplied
  multiply() {
    return this.numbers.map(i => i * this.multiplyBy);
  }
}
console.log(multiplier.multiply());

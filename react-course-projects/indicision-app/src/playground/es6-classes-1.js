class Person {
	constructor(name = 'Anonymous', age = 0) {
		this.name = name;
		this.age = age;
	}

	getGretting() {
		return `Hi. I am ${this.name}`;
	}

	getDescription() {
		return `${this.name} is ${this.age} year(s) old.`
	}
}

class Student extends Person {
	constructor(name, age, major) {
		super(name, age);
		this.major = major;
	}

	hasMajor() {
		return !!this.major;
	}

	getDescription() {
		let description = super.getDescription();

		if (this.hasMajor()) {
			description += ` Their major is ${this.major}.`
		}

		return description;
	}
}

class Traveler extends Person {
	constructor(name, age, homeLocation) {
		super(name, age);
		this.homeLocation = homeLocation;
	}

	getGretting() {
		let greeting = super.getGretting();

		if (this.homeLocation) {
			greeting += ` I am visiting from ${this.homeLocation}`;
		}

		return greeting;
	}
}

const me = new Person('Ayuth Mangmesap', 22);
console.log(me.getDescription());

const other = new Person();
console.log(other.getDescription());

const student = new Student('John Doe', 30, 'Computer Science');
console.log(student.getDescription());

const traveler = new Traveler('Jane Doe', 40, 'Bangkok');
console.log(traveler.getGretting());

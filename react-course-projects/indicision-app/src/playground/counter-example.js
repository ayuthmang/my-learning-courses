
let count = 0;
const addOne = () => {
	count++;
	renderCountApp();
}

const minusOne = () => {
	count--;
	renderCountApp();
}

const reset = () => {
	count = 0;
	renderCountApp();
}

const appRoot = document.getElementById('app');

const renderCountApp = () => {
	const templateTwo = (
		<div>
			<h1>Count: {count}</h1>
			<button onClick={addOne}>+1</button>
			<button onClick={minusOne}>-1</button>
			<button onClick={reset}>reset</button>
		</div>
	)

	ReactDOM.render(templateTwo, appRoot);
}

renderCountApp();
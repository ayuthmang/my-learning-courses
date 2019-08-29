console.log("App.js is running!");

const app = {
	title: "Indicision App",
	subtitle: "Put your life in the hands of the computer.",
	options: ["Option one", "Option two"]
};

const onFormSubmit = (e) => {
	e.preventDefault();

	const option = e.target.elements.option.value;

	if (option) {
		app.options.push(option);
		render();
	}
}

const onRemoveAll = () => {
	app.options = []
	render();
}

const onMakeDicision = () => {
	const randomNum = Math.floor(Math.random() * app.options.length);
	console.log(app.options[randomNum]);
}

const appRoot = document.getElementById("app");

const render = () => {
	const template = (
		<div>
			<h1>{app.title}</h1>
			{app.subtitle && <p>{app.subtitle}</p>}
			<p>{app.options.length > 0 ? "Here your options" : "No options"}</p>
			<button disabled={app.options.length === 0} onClick={onMakeDicision}>What should I do?</button>
			<ol>
				{app.options.map(option => {
					return <li key={option}>{option}</li>
				})}
			</ol>
			<form onSubmit={onFormSubmit}>
				<input type="text" name="option" />
				<button>Add Option</button>
				<button onClick={onRemoveAll}>Remove All</button>
			</form>
		</div>
	);

	ReactDOM.render(template, appRoot);
}

render();
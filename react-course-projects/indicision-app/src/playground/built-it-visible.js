const app = {
	isVisible: false
}

const toggleVisibility = () => {
	app.isVisible = !app.isVisible;
	render();
}

const appRoot = document.getElementById('app');

const render = () => {
	const template = (
		<div>
			<h1>Visibility Toggle</h1>
			<button onClick={toggleVisibility}>{app.isVisible ? 'Hide details' : 'Show details'}</button>
			{app.isVisible && (
				<div>
					<p>Hey. These are some details you can now see!</p>
				</div>
			)}
		</div>
	);

	ReactDOM.render(template, appRoot);
}

render();
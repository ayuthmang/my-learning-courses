// VisibilityToggle

class VisibilityToggle extends React.Component {
	constructor(props) {
		super(props);
		this.state = { 
			visibility: false
		}
		this.toggleVisibility = this.toggleVisibility.bind(this);
	}

	toggleVisibility() {
		this.setState((prevState) => {
			return {
				visibility: !prevState.visibility
			}
		})
	}

	render() {
		return (
			<div>
				<h1>Visibility Toggle</h1>
				<button onClick={this.toggleVisibility}>{this.state.visibility ? 'Hide details' : 'Show details'}</button>
				{this.state.visibility && (<p>Hey. These are some details you can now see!</p>)}
			</div>
		)
	}
}

ReactDOM.render(<VisibilityToggle />, document.getElementById('app'));

// const app = {
// 	isVisible: false
// }

// const toggleVisibility = () => {
// 	app.isVisible = !app.isVisible;
// 	render();
// }

// const appRoot = document.getElementById('app');

// const render = () => {
// 	const template = (
// 		<div>
// 			<h1>Visibility Toggle</h1>
// 			<button onClick={toggleVisibility}>{app.isVisible ? 'Hide details' : 'Show details'}</button>
// 			{app.isVisible && (
// 				<div>
// 					<p>Hey. These are some details you can now see!</p>
// 				</div>
// 			)}
// 		</div>
// 	);

// 	ReactDOM.render(template, appRoot);
// }

// render();
class Counter extends React.Component {

	constructor(props) {
		super(props);
		this.handlePlusOne = this.handlePlusOne.bind(this);
		this.handleMinusOne = this.handleMinusOne.bind(this);
		this.handleReset = this.handleReset.bind(this);
		this.state = {
			count: 0
		}
	}

	handlePlusOne() {
		this.setState((prevState) => {
			return {
				count: prevState.count + 1
			}
		});
	}

	handleMinusOne() {
		this.setState((prevState) => {
			return {
				count: prevState.count - 1
			}
		});
	}

	handleReset() {
		this.setState(() => {
			return {
				count: 0
			}
		});

		// this.setState({
		// 	count: 1
		// })
		// this.setState({
		// 	count: this.state.count + 1
		// })
	}

	render() {
		return (
			<div>
				<h1>Count: {this.state.count}</h1>
				<button onClick={this.handlePlusOne}>+1</button>
				<button onClick={this.handleMinusOne}>-1</button>
				<button onClick={this.handleReset}>handleReset</button>
			</div>
		)
	}
}

ReactDOM.render(<Counter />, document.getElementById('app'));

// let count = 0;
// const addOne = () => {
// 	count++;
// 	renderCountApp();
// }

// const minusOne = () => {
// 	count--;
// 	renderCountApp();
// }

// const reset = () => {
// 	count = 0;
// 	renderCountApp();
// }

// const appRoot = document.getElementById('app');

// const renderCountApp = () => {
// 	const templateTwo = (
// 		<div>
// 			<h1>Count: {count}</h1>
// 			<button onClick={addOne}>+1</button>
// 			<button onClick={minusOne}>-1</button>
// 			<button onClick={reset}>reset</button>
// 		</div>
// 	)

// 	ReactDOM.render(templateTwo, appRoot);
// }

// renderCountApp();
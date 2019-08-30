class IndecisionApp extends React.Component {
	constructor(props) {
		super(props);
		this.state = {
			title: 'Indicision App',
			subTitle: 'Put your life in the hands of a computer',
			options: ['a', 'b', 'c']
		};
		this.handleDeleteOptions = this.handleDeleteOptions.bind(this);
		this.handleAddOption = this.handleAddOption.bind(this);
		this.handlePick = this.handlePick.bind(this);
	}

	handleDeleteOptions() {
		this.setState(() => {
			return {
				options: []
			};
		});
	}

	handleAddOption(option) {
		if (!option) {
			return 'Enter a valid value to add item.';
		} else if (this.state.options.indexOf(option) > -1) {
			return 'This option is already exist';
		}

		this.setState((prevState) => {
			return {
				options: prevState.options.concat(option)
			}
		});
	}

	handlePick() {
		const option = Math.floor(Math.random() * this.state.options.length)
		alert(this.state.options[option]);
	}

	render() {
		return (
			<div>
				<Header title={this.state.title} subTitle={this.state.subTitle} />
				<Action hasOptions={this.state.options.length > 0} handlePick={this.handlePick} />
				<Options options={this.state.options} handleDeleteOptions={this.handleDeleteOptions} />
				<AddOption handleAddOption={this.handleAddOption} />
			</div>
		)
	}
}

class Header extends React.Component {
	render() {
		return (
			<div>
				<h1>{this.props.title}</h1>
				<h2>{this.props.subTitle}</h2>
			</div>
		)
	}
}

class Action extends React.Component {
	render() {
		return (
			<div>
				<button disabled={!this.props.hasOptions} onClick={this.props.handlePick}>What should I do?</button>
			</div>
		)
	}
}

class Options extends React.Component {
	render() {
		return (
			<div>
				<button onClick={this.props.handleDeleteOptions}>Remove All</button>
				{this.props.options.map(option => {
					return <Option key={option} optionText={option} />
				})}
			</div>
		)
	}
}

class Option extends React.Component {
	render() {
		return (
			<div>{this.props.optionText}</div>
		)
	}
}

class AddOption extends React.Component {
	constructor(props) {
		super(props);
		this.state = {
			error: undefined
		}
		this.onFormSubmit = this.onFormSubmit.bind(this);
	}

	onFormSubmit(e) {
		e.preventDefault();

		const option = e.target.elements.option.value.trim();
		const error = this.props.handleAddOption(option);

		this.setState(() => {
			return {
				error
			};
		});
	}

	render() {
		return (
			<div>
				<form onSubmit={this.onFormSubmit}>
					{this.state.error && <p>{this.state.error}</p>}
					<input type="text" name="option" />
					<button>Add Option</button>
				</form>
			</div>
		)
	}
}

ReactDOM.render(<IndecisionApp />, document.getElementById('app'));

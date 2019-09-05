class IndecisionApp extends React.Component {
	constructor(props) {
		super(props);
		this.state = {
			options: ['a', 'b', 'c']
		};
		this.handleDeleteOptions = this.handleDeleteOptions.bind(this);
		this.handleDeleteOption = this.handleDeleteOption.bind(this);
		this.handleAddOption = this.handleAddOption.bind(this);
		this.handlePick = this.handlePick.bind(this);
	}

	componentDidMount() {
		try {
			const json = JSON.parse(localStorage.getItem('options'));
			this.setState((prevState) => ({
				options: json
			}))
		} catch (e) {
			
		}
	}

	componentDidUpdate(prevProps, prevState) {
		if (prevState.options.length !== this.state.options.length) {
			const json = JSON.stringify(this.state.options);
			localStorage.setItem('options', json);
		}
	}

	componentWillUnmount() {
		console.log('componentWillUnmount')
	}

	handleDeleteOptions() {
		this.setState(() => ({
			options: []
		}));
	}

	handleDeleteOption(optionToRemove) {
		this.setState((prevState) => ({
			options: prevState.options.filter((option) => option !== optionToRemove)
		}));
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
		const subTitle = 'Put your life in the hands of a computer';

		return (
			<div>
				<Header subTitle={subTitle} />
				<Action hasOptions={this.state.options.length > 0} handlePick={this.handlePick} />
				<Options
					options={this.state.options}
					handleDeleteOptions={this.handleDeleteOptions}
					handleDeleteOption={this.handleDeleteOption} />
				<AddOption handleAddOption={this.handleAddOption} />
			</div>
		)
	}
}

const Header = (props) => (
	<div>
		<h1>{props.title}</h1>
		<h2>{props.subTitle}</h2>
	</div>
)

Header.defaultProps = {
	title: 'Indicision App'
};

const Action = (props) => (
	<div>
		<button disabled={!props.hasOptions} onClick={props.handlePick}>What should I do?</button>
	</div>
);

const Options = (props) => (
	<div>
		<button onClick={props.handleDeleteOptions}>Remove All</button>
		{props.options.length === 0 && <p>Please add an option to get started</p>}
		{props.options.map(option => {
			return <Option handleDeleteOption={props.handleDeleteOption} key={option} optionText={option} />
		})}
	</div>
)

const Option = (props) => (
	<div>
		{props.optionText}
		<button onClick={(e) => { props.handleDeleteOption(props.optionText); }}>remove</button>
	</div>
)

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

		this.setState(() => ({ error }));
		if (!error) {
			e.target.elements.option.value = '';
		}
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

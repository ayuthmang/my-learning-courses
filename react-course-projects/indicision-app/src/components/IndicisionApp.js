import React from 'react';
import Header from './Header';
import Action from './Action';
import Options from './Options';
import AddOption from './AddOption';
import OptionModal from './OptionModal';

class IndecisionApp extends React.Component {

	state = {
		options: [],
		selectedOption: undefined,
	}

	componentDidMount() {
		try {
			const json = localStorage.getItem('options');
			const options = JSON.parse(json);
      if (options) {
        this.setState(() => ({ options }));
      }
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
    console.log('componentWillUnmount');
  }

	handleClearSelectedOption = () => {
		this.setState(() => ({
			selectedOption: null
		}))
	}

	handleDeleteOptions = () => {
		this.setState(() => ({
			options: []
		}));
	}

	handleDeleteOption = (optionToRemove) => {
		this.setState((prevState) => ({
			options: prevState.options.filter((option) => option !== optionToRemove)
		}));
	}

	handleAddOption = (option) => {
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

	handlePick = () => {
		const randomNum = Math.floor(Math.random() * this.state.options.length)
		const option = this.state.options[randomNum]
		this.setState(() => ({
			selectedOption: option
		}));
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
				<OptionModal
					selectedOption={this.state.selectedOption}
					handleClearSelectedOption={this.handleClearSelectedOption}
				/>
			</div>
		)
	}
}

export default IndecisionApp;
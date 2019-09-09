import React from 'react';

class AddOption extends React.Component {

	state = {
		error: undefined
	}

	onFormSubmit = (e) => {
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

export default AddOption;
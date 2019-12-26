import React from 'react';
import { connect } from 'react-redux';
import { setTextFilter, sortByAmount, sortByDate } from '../actions/filters';

const ExpenseListFilter = (props) => (
  <div>
    <input type="text" defaultValue={props.filters.text} onChange={e => {
      console.log(e.target.value);
      props.dispatch(setTextFilter(e.target.value));
    }} />
    <select
      value={props.filters.sortBy}
      onChange={e => {
        const value = e.target.value;
        if (value === 'amount') {
          props.dispatch(sortByAmount());
        } else {
          props.dispatch(sortByDate());
        }
      }}>
      <option value="date">Date</option>
      <option value="amount">Amount</option>
    </select>
  </div>
);

const mapStateToProps = (state) => {
  return {
    filters: state.filters
  }
}

export default connect(mapStateToProps)(ExpenseListFilter);

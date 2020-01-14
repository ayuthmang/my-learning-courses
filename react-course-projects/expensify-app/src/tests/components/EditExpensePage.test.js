import React from 'react';
import { shallow } from 'enzyme';

import expenses from '../fixtures/expenses';
import { EditExpensePage } from '../../components/EditExpensePage';

let editExpense, removeExpense, history, wrapper;

beforeEach(() => {
  editExpense = jest.fn();
  removeExpense = jest.fn();
  history = { push: jest.fn() };
  wrapper = shallow(
    <EditExpensePage
      expense={expenses[0]}
      editExpense={editExpense}
      removeExpense={removeExpense}
      history={history}
    />
  );
});

it('should render EditExpensePage', () => {
  expect(wrapper).toMatchSnapshot();
});

it('should handle editExpense', () => {
  wrapper.find('ExpenseForm').prop('onSubmit')(expenses[0]);
  expect(editExpense).toHaveBeenLastCalledWith(expenses[0].id, expenses[0]);
  expect(history.push).toHaveBeenLastCalledWith('/');
});

it('should handle removeExpense', () => {
  wrapper.find('button').simulate('click');
  expect(removeExpense).toHaveBeenLastCalledWith({ id: expenses[0].id });
  expect(history.push).toHaveBeenLastCalledWith('/');
});

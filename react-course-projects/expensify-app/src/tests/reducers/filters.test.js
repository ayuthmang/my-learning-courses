import filtersReducer from '../../reducers/filters';
import moment from 'moment';

test('should setup default filter values', () => {
  const state = filtersReducer(undefined, { type: '@@INIT' });
  expect(state).toEqual({
    text: '',
    sortBy: 'date',
    startDate: moment().startOf('month'),
    endDate: moment().endOf('month'),
  });
});

test('should set sortBy to amount', () => {
  const state = filtersReducer(undefined, { type: 'SORT_BY_AMOUNT' });
  expect(state.sortBy).toBe('amount');
});

test('should set sortBy to date', () => {
  const currentState = {
    text: '',
    startDate: undefined,
    endDate: undefined,
    sortBy: 'amount'
  };
  const state = filtersReducer(currentState, { type: 'SORT_BY_DATE' });
  expect(state.sortBy).toBe('date');
});

test('should set text filter', () => {
  const text = 'This is my filter';
  const action = {
    type: 'SET_TEXT_FILTER',
    text
  }
  const currentState = {
    text: '',
    startDate: undefined,
    endDate: undefined,
    sortBy: 'date'
  }
  const state = filtersReducer(currentState, action);
  expect(state.text).toBe('This is my filter');
})

test('should set startDate filter', () => {
  const startDate = moment();
  const action = {
    type: 'SET_START_DATE',
    startDate
  }
  const currentState = {
    text: '',
    startDate: undefined,
    endDate: undefined,
    sortBy: 'date'
  }
  const state = filtersReducer(currentState, action);
  expect(state.startDate).toEqual(startDate);
})


test('should set endDate filter', () => {
  const endDate = moment();
  const aciton = {
    type: 'SET_END_DATE',
    endDate
  };
  const currentState = {
    text: '',
    startDate: undefined,
    endDate: undefined,
    sortBy: 'date'
  }
  const state = filtersReducer(currentState, aciton);
  expect(state.endDate).toEqual(endDate);
})

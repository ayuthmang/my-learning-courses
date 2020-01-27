import React, { useState } from 'react';
import ReactDOM from 'react-dom';
import * as serviceWorker from './serviceWorker';

const App = (props) => {
  const [count, setCount] = useState(props.count);
  const [text, setText] = useState('');

  return (
    <div>
      <p>The current {text || 'count'} is {count}</p>
      <button onClick={() => setCount(count + 1)}>+1</button>
      <button onClick={() => setCount(count - 1)}>-1</button>
      <button onClick={() => setCount(0)}>reset</button>
      <input value={text} onChange={(e) => setText(e.target.value)} />
    </div>
  )
}

// Not recommended to store all of the state in the single object with single call useState.
// It better to call useState multiple times for different things we end up tracking.
// const App = (props) => {
//   const [state, setState] = useState({
//     count: props.count,
//     text: ''
//   })

//   return (
//     <div>
//       <p>The current {state.text || 'count'} is {state.count}</p>
//       <button onClick={() => setState({ ...state, count: state.count + 1 })}>+1</button>
//       <button onClick={() => setState({ ...state, count: 0 })}>reset</button>
//       <button onClick={() => setState({ ...state, count: state.count - 1 })}>-1</button>
//       <input value={state.text} onChange={(e) => setState({ ...state, text: e.target.value})} />
//     </div>
//   )
// }

App.defaultProps = {
  count: 0
}

ReactDOM.render(<App count={30} />, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();

import { combineReducers, createStore } from 'redux';
import { githubReducer } from './reducer/GithubReducer';

const reducers = combineReducers({
  githubReducer
});

export default createStore(reducers)

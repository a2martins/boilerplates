import { combineReducers, createStore } from 'redux';
import { githubReducer } from "../adapters";
import { User } from '../entities';

export type StateType = {
  user: User
}

const reducers = combineReducers({
  githubReducer
});

export const configureStore = () => {
  return createStore(reducers)
}

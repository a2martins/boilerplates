import { combineReducers, createStore } from 'redux';
import sidebarReducer from './components/Sidebar/reducer';

const reducers = combineReducers({
    sidebarReducer,
});

const store = createStore(reducers);

export default store;

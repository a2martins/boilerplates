// import PrivateRoute from './privateRoutes';
import React from 'react';
import { Provider } from 'react-redux';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import Main from '../presentation/pages/Main';
import store from "./store";



const Routes = () => (
    <Provider store={store}>
        <BrowserRouter>
            <Switch>
                <Route exact path="/" component={Main} />
                {/* <PrivateRoute path="/relatorios" component={RelatoriosScreen} /> */}
                <Route path="*" component={() => <h1>Page not found</h1>} />
            </Switch>
        </BrowserRouter>
    </Provider>
);

export default Routes;

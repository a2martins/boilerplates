import React from 'react';
import {View} from 'react-native';
import {Provider} from 'react-redux';
import {NativeRouter, Route, Switch} from 'react-router-native';
import Main from '../presentation/pages/Main';
import store from './store';

const Routes = () => (
    <Provider store={store}>
        <NativeRouter>
            <Switch>
                <Route exact path="/" component={Main} />
                <Route path="*" component={() => <View>Page not found</View>} />
            </Switch>
        </NativeRouter>
    </Provider>
);

export default Routes;

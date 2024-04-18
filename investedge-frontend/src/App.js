// src/App.js
import React from 'react';
import { BrowserRouter as Router, Route, Switch, Redirect } from 'react-router-dom';
import Login from './components/Login';
import Dashboard from './components/Dashboard';
import Navbar from './components/Navbar';
import Footer from './components/Footer';
import Recommendations from './components/Recommendations';
import PrivateRoute from './components/PrivateRoute'; // You will create this component
import './App.css';

function App() {
  return (
    <Router>
      <div className="App">
        <Navbar />
        <Switch>
          <Route path="/login" component={Login} />
          <PrivateRoute path="/dashboard" component={Dashboard} />
          <PrivateRoute path="/recommendations" component={Recommendations} />
          <Redirect from="/" to="/login" exact />
        </Switch>
        <Footer />
      </div>
    </Router>
  );
}

export default App;

import React from 'react';
import { render } from 'react-dom'

const App = React.createClass({

    render() {

    return (<div>Working!!</div>)
    }
})

render(<App />, document.getElementById("timeline"))
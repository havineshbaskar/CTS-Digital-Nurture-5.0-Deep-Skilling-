import React, { Component } from "react";

class EventExamples extends Component {
  constructor(props) {
    super(props);

    this.state = {
      count: 0,
      amount: "",
      currency: "Euro"
    };
  }

  // Increment Counter
  increment = () => {
    this.setState({
      count: this.state.count + 1
    });

    this.sayHello();
  };

  // Decrement Counter
  decrement = () => {
    this.setState({
      count: this.state.count - 1
    });
  };

  // Hello Message
  sayHello = () => {
    alert("Hello Member!");
  };

  // Welcome Message
  welcome = () => {
    alert("Welcome");
  };

  // Click on Me
  onPress = () => {
    alert("I was clicked");
  };

  // Amount Change
  handleAmountChange = (event) => {
    this.setState({
      amount: event.target.value
    });
  };

  // Currency Change
  handleCurrencyChange = (event) => {
    this.setState({
      currency: event.target.value
    });
  };

  // Submit
  handleSubmit = (event) => {
    event.preventDefault();

    const amount = parseInt(this.state.amount);

    const result = amount * 80;

    alert("Converting to Euro Amount is " + result);
  };

  render() {
    return (
      <div style={{ margin: "20px" }}>

        <h1>Event Examples App</h1>

        <h2>Counter: {this.state.count}</h2>

        <button onClick={this.increment}>
          Increment
        </button>

        {" "}

        <button onClick={this.decrement}>
          Decrement
        </button>

        <br /><br />

        <button onClick={this.welcome}>
          Say Welcome
        </button>

        <br /><br />

        <button onClick={this.onPress}>
          Click on me
        </button>

        <hr />

        <h1 style={{ color: "green" }}>
          Currency Convertor!!!
        </h1>

        <form onSubmit={this.handleSubmit}>

          <label>Amount: </label>

          <input
            type="number"
            value={this.state.amount}
            onChange={this.handleAmountChange}
          />

          <br /><br />

          <label>Currency: </label>

          <select
            value={this.state.currency}
            onChange={this.handleCurrencyChange}
          >
            <option>Euro</option>
          </select>

          <br /><br />

          <button type="submit">
            Submit
          </button>

        </form>

      </div>
    );
  }
}

export default EventExamples;
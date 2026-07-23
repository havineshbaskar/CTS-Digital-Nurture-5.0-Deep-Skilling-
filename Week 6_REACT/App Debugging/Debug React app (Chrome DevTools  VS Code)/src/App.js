import React, { useState } from "react";

function App() {

  const [count, setCount] = useState(0);

  function increase() {

    console.log("Function Started");

    console.log("Current Count:", count);

    const newCount = count + 1;

    console.log("New Count:", newCount);

    setCount(newCount);

    console.log("State Update Requested");

    console.log("Function Finished");
  }

  return (
    <div style={{ textAlign: "center", marginTop: "100px" }}>
      <h1>React Debugging Demo</h1>

      <h2>{count}</h2>

      <button onClick={increase}>
        Increase
      </button>
    </div>
  );
}

export default App;
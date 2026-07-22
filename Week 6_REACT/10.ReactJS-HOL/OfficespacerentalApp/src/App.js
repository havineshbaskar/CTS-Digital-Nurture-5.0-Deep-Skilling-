import officeImage from "./office.jpg";
import "./App.css";

function App() {
  const officeList = [
    {
      Name: "CTS",
      Rent: 75000,
      Address: "Chennai",
    },
  
  ];

  return (
    <div style={{ textAlign: "center" }}>
      <h1>Office Space, at Affordable Range</h1>

      <img
        src={officeImage}
        alt="Office Space"
        width="900px"
        height="500px"
      />

      <br />
      <br />

      {officeList.map((item, index) => (
        <div key={index}>
          <h2>Name: {item.Name}</h2>

          <h3
            style={{
              color: item.Rent <= 60000 ? "red" : "green",
            }}
          >
            Rent: Rs. {item.Rent}
          </h3>

          <h3>Address: {item.Address}</h3>

          <hr />
        </div>
      ))}
    </div>
  );
}

export default App;
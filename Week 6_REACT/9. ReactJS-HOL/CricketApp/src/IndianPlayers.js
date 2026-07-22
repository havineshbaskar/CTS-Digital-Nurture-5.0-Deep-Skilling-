import React from "react";

function IndianPlayers() {

  const IndianTeam = [
    "Sachin ",
    "Dhoni ",
    "Virat ",
    "Rohit ",
    "Yuvaraj ",
    "Raina "
  ];

  const [first, second, third, fourth, fifth, sixth] = IndianTeam;

  const oddPlayers = [
    { position: "First", player: first },
    { position: "Third", player: third },
    { position: "Fifth", player: fifth }
  ];

  const evenPlayers = [
    { position: "Second", player: second },
    { position: "Fourth", player: fourth },
    { position: "Sixth", player: sixth }
  ];

  const T20Players = [
    "Mr. First Player",
    "Mr. Second Player",
    "Mr. Third Player"
  ];

  const RanjiPlayers = [
    "Mr. Fourth Player",
    "Mr. Fifth Player",
    "Mr. Sixth Player"
  ];

  const mergedPlayers = [...T20Players, ...RanjiPlayers];

  return (
    <div>

      <h2>Odd Players</h2>
      <table border="1" cellPadding="8">
        <thead>
          <tr>
            <th>Position</th>
            <th>Player</th>
          </tr>
        </thead>
        <tbody>
          {oddPlayers.map((item, index) => (
            <tr key={index}>
              <td>{item.position}</td>
              <td>{item.player}</td>
            </tr>
          ))}
        </tbody>
      </table>

      <br />

      <h2>Even Players</h2>
      <table border="1" cellPadding="8">
        <thead>
          <tr>
            <th>Position</th>
            <th>Player</th>
          </tr>
        </thead>
        <tbody>
          {evenPlayers.map((item, index) => (
            <tr key={index}>
              <td>{item.position}</td>
              <td>{item.player}</td>
            </tr>
          ))}
        </tbody>
      </table>

      <br />

      <h2>List of Indian Players Merged</h2>
      <table border="1" cellPadding="8">
        <thead>
          <tr>
            <th>S.No</th>
            <th>Player Name</th>
          </tr>
        </thead>
        <tbody>
          {mergedPlayers.map((player, index) => (
            <tr key={index}>
              <td>{index + 1}</td>
              <td>{player}</td>
            </tr>
          ))}
        </tbody>
      </table>

    </div>
  );
}

export default IndianPlayers;
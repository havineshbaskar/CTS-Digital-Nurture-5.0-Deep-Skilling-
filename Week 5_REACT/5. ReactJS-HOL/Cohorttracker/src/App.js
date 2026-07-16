import './App.css';
import CohortDetails from './components/CohortDetails';

function App() {

  const cohorts = [
    {
      name: "Design Patterns Training",
      status: "Completed",
      startDate: "10-Feb-2026",
      coach: "Lakshman",
      trainer: "Jojo Jose"
    },
    {
      name: "React Training",
      status: "Ongoing",
      startDate: "10-Sep-2026",
      coach: "Bhaviya",
      trainer: "Elisa Smith"
    },
    {
      name: "PS-SQL",
      status: "Ongoing",
      startDate: "24-Dec-2026",
      coach: "Shruthi",
      trainer: "John Doe"
    },
    {
      name: "Java full Stack",
      status: "completed",
      startDate: "11-Feb-2027",
      coach: "Havinesh",
      trainer: "To Be Assigned"
    },
    {
      name: "Spring boot",
      status: "Ongoing",
      startDate: "24-july-2026",
      coach: "Yazhini",
      trainer: "Emma Swan"
    },
    {
      name: "Hibernet",
      status: "Ongoing",
      startDate: "22-july-2026",
      coach: "Aathman",
      trainer: "Babjee Rao"
    },
    {
      name: "Angular",
      status: "Scheduled",
      startDate: "10-Sep-2026",
      coach: "Girisrinan",
      trainer: "Marie Curie"
    }
  ];

  return (
    <div>
      <h1 style={{ textAlign: "center" }}>Cohorts Details</h1>

      {cohorts.map((cohort, index) => (
        <CohortDetails
          key={index}
          cohort={cohort}
        />
      ))}
    </div>
  );
}

export default App;
import { CalculateScore } from "./Components/CalculateScore";
import "./Stylesheets/mystyle.css";

function App() {
    return (
        <div className="app-container">
            <h1 className="main-title">Student Management Portal</h1>

            <CalculateScore
                Name="Havinesh D"
                School="D.V.S Higher Secondary School"
                total={420}
                goal={6}
            />
        </div>
    );
}

export default App;
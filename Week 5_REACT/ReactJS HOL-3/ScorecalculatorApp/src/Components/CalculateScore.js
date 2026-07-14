import "../Stylesheets/mystyle.css";

const calculateAverage = (total, goal) => {
    return (total / goal).toFixed(2);
};

export const CalculateScore = ({ Name, School, total, goal }) => {
    return (
        <div className="card">
            <h2>Student Score Details</h2>

            <div className="details">
                <div>
                    <b>Name:</b> <span>{Name}</span>
                </div>

                <div>
                    <b>School:</b> <span>{School}</span>
                </div>

                <div>
                    <b>Total Score:</b> <span>{total}</span>
                </div>

                <div>
                    <b>Goal:</b> <span>{goal}</span>
                </div>

                <div>
                    <b>Average Score:</b>{" "}
                    <span>{calculateAverage(total, goal)}</span>
                </div>
            </div>
        </div>
    );
};
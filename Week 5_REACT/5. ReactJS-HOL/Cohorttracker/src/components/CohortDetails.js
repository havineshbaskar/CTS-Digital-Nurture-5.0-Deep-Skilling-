import styles from "./CohortDetails.module.css";

function CohortDetails({ cohort }) {

    return (

        <div className={styles.box}>

            <h3
                style={{
                    color: cohort.status === "Ongoing" ? "green" : "blue"
                }}
            >
                {cohort.name}
            </h3>

        <div className="details">
    <p><b>Started On</b> : {cohort.startDate}</p>
    <p><b>Current Status</b> : {cohort.status}</p>
    <p><b>Coach</b> : {cohort.coach}</p>
    <p><b>Trainer</b> : {cohort.trainer}</p>
</div>

        </div>

    );
}

export default CohortDetails;
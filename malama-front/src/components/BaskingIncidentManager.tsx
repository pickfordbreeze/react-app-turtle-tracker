import React, { useState, useEffect } from "react";
import axios from "axios";

const BaskingIncidentManager = () => {
  const [incidents, setIncidents] = useState([]);
  const [newIncident, setNewIncident] = useState({
    turtleId: "",
    date: "",
    timeOnBeach: "",
    timeOffBeach: "",
  });

  useEffect(() => {
    axios.get("http://localhost:8080/BaskingIncidents").then((response) => {
      setIncidents(response.data);
    });
  }, []);

  const addIncident = (e: React.FormEvent) => {
    e.preventDefault();
    axios
      .post("http://localhost:8080/BaskingIncident", newIncident)
      .then(() => window.location.reload());
  };

  return (
    <div>
      <h2>Basking Incidents</h2>
      <form onSubmit={addIncident}>
        <input
          type="text"
          placeholder="Turtle ID"
          onChange={(e) =>
            setNewIncident({ ...newIncident, turtleId: e.target.value })
          }
        />
        <input
          type="date"
          onChange={(e) =>
            setNewIncident({ ...newIncident, date: e.target.value })
          }
        />
        <input
          type="time"
          placeholder="Time On Beach"
          onChange={(e) =>
            setNewIncident({ ...newIncident, timeOnBeach: e.target.value })
          }
        />
        <input
          type="time"
          placeholder="Time Off Beach"
          onChange={(e) =>
            setNewIncident({ ...newIncident, timeOffBeach: e.target.value })
          }
        />
        <button type="submit">Add Incident</button>
      </form>

      <ul>
        {incidents.map((incident: any) => (
          <li key={incident.incidentId}>
            {incident.turtleId} - {incident.date} ({incident.timeOnBeach} -{" "}
            {incident.timeOffBeach})
          </li>
        ))}
      </ul>
    </div>
  );
};

export default BaskingIncidentManager;

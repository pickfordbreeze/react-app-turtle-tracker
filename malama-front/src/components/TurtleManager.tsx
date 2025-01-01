import React, { useState, useEffect } from "react";
import axios from "axios";

const TurtleManager = () => {
  const [turtles, setTurtles] = useState([]);
  const [newTurtle, setNewTurtle] = useState({
    name: "",
    nameId: "",
    age: 0,
    sex: "",
    story: "",
    firstSeenDate: "",
  });

  useEffect(() => {
    axios.get("http://localhost:8080/Turtles").then((response) => {
      setTurtles(response.data);
    });
  }, []);

  const addTurtle = (e: React.FormEvent) => {
    e.preventDefault();
    axios
      .post("http://localhost:8080/Turtle", newTurtle)
      .then(() => window.location.reload());
  };

  return (
    <div>
      <h2>Turtles</h2>
      <form onSubmit={addTurtle}>
        <input
          type="text"
          placeholder="Name"
          onChange={(e) =>
            setNewTurtle({ ...newTurtle, name: e.target.value })
          }
        />
        <input
          type="text"
          placeholder="Name ID"
          onChange={(e) =>
            setNewTurtle({ ...newTurtle, nameId: e.target.value })
          }
        />
        <input
          type="number"
          placeholder="Age"
          onChange={(e) =>
            setNewTurtle({ ...newTurtle, age: Number(e.target.value) })
          }
        />
        <input
          type="text"
          placeholder="Sex"
          onChange={(e) =>
            setNewTurtle({ ...newTurtle, sex: e.target.value })
          }
        />
        <textarea
          placeholder="Story"
          onChange={(e) =>
            setNewTurtle({ ...newTurtle, story: e.target.value })
          }
        ></textarea>
        <input
          type="date"
          onChange={(e) =>
            setNewTurtle({ ...newTurtle, firstSeenDate: e.target.value })
          }
        />
        <button type="submit">Add Turtle</button>
      </form>

      <ul>
        {turtles.map((turtle: any) => (
          <li key={turtle.turtleId}>
            {turtle.name} ({turtle.nameId})
          </li>
        ))}
      </ul>
    </div>
  );
};

export default TurtleManager;

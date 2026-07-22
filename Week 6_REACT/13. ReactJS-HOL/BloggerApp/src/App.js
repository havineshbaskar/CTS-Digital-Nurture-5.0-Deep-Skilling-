import './App.css';
import CourseDetails from './CourseDetails';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';

function App() {
  return (
    <div className="App">
      <h1>Blogger App Dashboard</h1>

      <div className="container">
        <CourseDetails />
        <BookDetails />
        <BlogDetails />
      </div>
    </div>
  );
}

export default App;
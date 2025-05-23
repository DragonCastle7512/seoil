import { render, screen } from '@testing-library/react';
import App from './App';
import PhonebookList from './PhonbookList';

test('renders learn react link', () => {
  render(<PhonebookList />);
  const linkElement = screen.getByText(/learn react/i);
  expect(linkElement).toBeInTheDocument();
});
